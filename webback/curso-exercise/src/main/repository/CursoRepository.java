package main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import main.Usuario.Usuario;
import main.models.CategoriaCurso;

@Repository
public class CursoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // get all do DB
    private static String SELECT_ALL = "select * from Categoria_Curso";

    public List<CategoriaCurso> obterTodos() {
        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Categoria_Curso>() {
            @Override
            public Categoria_Curso mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Categoria_Curso(rs.getInt("id"), rs.getString("nome"));
            }
        });
    }

    // insert
    public static String INSERT = "insert into CategoriaCurso";

    public CategoriaCurso inserir(CategoriaCurso _categoriaCurso) {
        jdbcTemplate.update(INSERT, new Object[] { _categoriaCurso.getNome() });
        return _categoriaCurso;
    }

    // select por nome
    private static final String SELECT_BY_NAME = "SELECT * FROM Categoria_Curso WHERE nome LIKE ?";

    public List<Categoria_Curso> buscarPorNome(String nome) {
        String nomeLike = "%" + nome + "%";

        return jdbcTemplate.query(SELECT_BY_NAME, new Object[] { nomeLike }, new RowMapper<Categoria_Curso>() {
            @Override
            public Categoria_Curso mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Categoria_Curso(rs.getInt("id"), rs.getString("nome"));
            }
        });
    }

    // Editar
    public static String UPDATE = "UPDATE Categoria_curso SET nome = ? where id = ?";

    public CategoriaCurso Editar(CategoriaCurso _categoriaCurso) {
        jdbcTemplate.update(UPDATE, categoriaCurso.getNome(), categoriaCurso.getId());
        return _categoriaCurso;
    }

    // Excluir passando id
    private static final String DELETE = "DELETE FROM Categoria_Curso WHERE id = ?";

    public int excluir(int id) {
        return jdbcTemplate.update(DELETE, id);
    }

    // Excluir passando objeto
    private static final String DELETE_OBJ = "DELETE FROM Categoria_Curso WHERE id = ?";
    public int excluir(Categoria_Curso categoriaCurso) {
        return jdbcTemplate.update(DELETE_OBJ, categoriaCurso.getId());
    }

}
