package persistencia.dao.interfaz;

import dto.PersonaDTO;

import java.util.List;

public interface PersonaDAO {
	
	public boolean insert(PersonaDTO persona);

	public boolean delete(PersonaDTO persona_a_eliminar);
	
	public List<PersonaDTO> readAll();

	public boolean update(PersonaDTO persona_a_editar);
}
