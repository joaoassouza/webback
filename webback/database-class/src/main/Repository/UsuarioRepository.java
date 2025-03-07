package main.Repository;

@Repository
public class UsuarioRepository {
    private static String INSERT = "insert into usuario (nome, email, senha) values (?,?,?)";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Usuario inserir(Usuario usuario) {
        jdbcTemplate.update(INSERT, new Object[] { usuario.getNome(), usuario.getEmail(), usuario.getSenha() });
        return usuario;
    }

    private static String SELECT_ALL = "select * from usuario";

    public List<Usuario> obterTodos() {
        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Usuario>() {
            @Override
            public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
            }
        });
    }
}