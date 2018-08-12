package tikka.core.mappings;

import java.io.File;

public interface Mapper<T> {

    T mapDocumentOf(File _file);
}
