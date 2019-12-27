package np.com.pantbinod.springbootfinaldemo.common;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BaseConverter<E,D> implements ISingleEntryConverter<E,D>, IListEntryConverter<E,D>{
    @Override
    public D convertEntityToDto(E entity) {
        return null;
    }

    @Override
    public E convertDtoToEntity(D dto) {
        return null;
    }

    @Override
    public E copyConvertDtoToEntity(D dto) {
        return null;
    }

    @Override
    public D copyConvertEntityToDto(E entity) {
        return null;
    }


    @Override
    public List<D> convertListEntityToDtoList(List<E> dtoList) {
        return dtoList.parallelStream().map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<E> convertListDtoEntityList(List<D> entityList) {

        return entityList.parallelStream().map(this::convertDtoToEntity)
                .collect(Collectors.toList());
    }
}
