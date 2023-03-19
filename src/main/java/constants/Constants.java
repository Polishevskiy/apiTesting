package constants;

import static constants.Constants.Path.SWAPI_PATH;
import static constants.Constants.Servers.JSON_PLACEHOLDER_URL;
import static constants.Constants.Servers.SWAPI_URL;

public class Constants {

    public static class RubVariable {
        public static String server = JSON_PLACEHOLDER_URL;
        public static String path = "";
    }

    public static class Servers {
        public static String SWAPI_URL = "https://swapi.dev/";
        public static String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com/";
        public static String GOOGLE_PLACES_URL;
        public static String REQUSTBIN_URL = "https://eoxj9bvpg6dgntd.m.pipedream.net";
    }

    public static class Path {
        public static String SWAPI_PATH = "api/";
        public static String GOOGLE_PLACES_PATH;
    }

    public static class Actions {
        //swapi
        public static String SWAPI_GET_PEOPLE = "people/";
        //google places
        public static String GOOGLE_PLACES_PATH;
        //jsonplaceholder
        public static String JSON_PLACEHOLDER_GET = "comments/";
        public static String JSON_PLACEHOLDER_PUT = "posts/1/";
        public static String JSON_PLACEHOLDER_DELETE = "posts/1/";
        public static String JSON_PLACEHOLDER_POST = "posts/";
    }
}
