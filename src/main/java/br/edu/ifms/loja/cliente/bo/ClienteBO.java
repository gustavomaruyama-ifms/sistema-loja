package br.edu.ifms.loja.cliente.bo;

import br.edu.ifms.loja.app.bo.GenericBO;
import br.edu.ifms.loja.cliente.dao.ClienteDAO;
import br.edu.ifms.loja.cliente.datamodel.Cliente;
import java.sql.SQLException;
import java.util.List;

public class ClienteBO extends GenericBO<Cliente>{

    private ClienteDAO daoCliente;
    
    public ClienteBO() throws SQLException {
        super(Cliente.class);
        daoCliente = new ClienteDAO();
    }

    public List<Cliente> buscarClientePorCpf(String cpf) {
        return daoCliente.buscarPorCpf(cpf);
    }

    public List<Cliente> buscarClientePorNome(String nome) {
        return daoCliente.buscarClientePorNome(nome);
    }

    public List<Cliente> buscarClientePorNomeOuCPF(String param){
        return daoCliente.buscarClientePorNomeOuCPF(param, param);
    }
}
