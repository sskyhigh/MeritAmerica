package com.techelevator.search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The Search Domain is a list of files to be read and indexed by the Search Engine.
 * <p>
 * Folders are NOT recursively searched.
 */
public class SearchDomain {

    private String folder;
    private List<String> files;

    /**
     * Create a Search Domain of a folder
     *
     * @param folder
     * @throws SearchDomainException
     */
    public SearchDomain(String folder) throws SearchDomainException {
        this.folder = folder;
        this.files = buildDomain();
    }

    public String getFolder() {
        return folder;
    }

    public List<String> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String file : files) {
            sb.append(file);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Folders are NOT recursively searched.
     *
     * @return
     * @throws SearchDomainException gather name files.
     */
    private List<String> buildDomain() throws SearchDomainException {
        try {
            files = new ArrayList<>();
            // Step Three: Complete the buildDomain method
            File folder = new File("data");
            //loops each time from folder and adds to files
            File[] getListFiles = folder.listFiles();

            if (getListFiles != null) {
                for (File file : getListFiles) {
                    if (file.isFile()) {
                        // gets name of the file and adds to *files*
                        files.add(file.getName());
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return files;
    }
}
