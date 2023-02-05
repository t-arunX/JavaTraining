package java_basics.day11;

public interface Inters {
        static int x = 2022;
        // int num();
        default int fun(){
            return 69;
        }
        default String mems(){
            return "k";
        }
    }
