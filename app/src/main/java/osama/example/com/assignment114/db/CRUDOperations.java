/**
 * 
 */
package osama.example.com.assignment114.db;

import java.util.List;

import osama.example.com.assignment114.vo.NameVO;


public interface CRUDOperations {

	/**
	 *  Adding new NameVO
	 * @param name
	 */
	public void addNameVO(NameVO name);
 
	/**
	 * Getting single NameVO
	 * @param id
	 * @return
	 */
	public NameVO getNameVO(int id);

	/**
	 * Getting All NameVO
	 * @return
	 */
	public List<NameVO> getAllNameVO();

	/**
	 * Getting NameVO Count
	 * @return
	 */
	public int getNameVOCount();

	/**
	 * Updating single NameVO
	 * @param name
	 * @return
	 */
	public int updateNameVO(NameVO name);

	/**
	 * Deleting single NameVO
	 * @param name
	 */
	public void deleteNameVO(NameVO name);
	
	/**
	 * Deleting all NameVOs
	 */
	public void deleteAllNames();
	
}
