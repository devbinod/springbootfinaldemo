package np.com.pantbinod.springbootfinaldemo.common;

import java.util.List;

public interface IListEntryConverter<E,D> {

    /*
    * convert list of entity to dto
     */

    List<D> convertListEntityToDtoList(List<E> dtoList);
    List<E> convertListDtoEntityList(List<D> entityList);


}
