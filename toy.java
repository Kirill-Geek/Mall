public class toy {
    int id;
    String name;
    int count;
    int drop_chance;


    public toy(int ids, String names, int counts, int drop_chances) {
        id = ids;
        name = names;
        count = counts;
        drop_chance = drop_chances;

    }

    public int count() {
        return count;
    }

    public int counts() {
        count -= 1;
        return count;
    }

    public String getName() {
        return name;
    }

    public int addCountToy(int x) {
        count = count + x;
        System.out.printf("Было дабавлено - %d игрушек (%s)\n", x, getName());
        return count; 
    }
    

    public int dropChance() {
        return drop_chance;
    }

    public String getInfo() {
        char a = '%';
        return String.format("id - %d, Название - %s, Количество - %d, Шанс выпадения - %d%c", this.id, this.name, this.count,this.drop_chance,a); 
    }
    
}
