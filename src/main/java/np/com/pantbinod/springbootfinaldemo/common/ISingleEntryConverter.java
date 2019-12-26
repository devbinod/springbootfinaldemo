package np.com.pantbinod.springbootfinaldemo.common;

public interface ISingleEntryConverter<E,D> {


    /*
    * convert entity to dto
     */

    D convertEntityToDto(E entity);


    /*
    * convert dto to entity
     */

    E convertDtoToEntity(D dto);



    E copyConvertDtoToEntity(D dto);
    D copyConvertEntityToDto(E entity);


}
