package TestInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static int countBonus(List<Dto> dtosCount){
        int rq = 0;
        for (Dto dto:dtosCount) {
            rq+=dto.getBonus();
        }
        return rq;
    }
    public static void main(String[] args) {

        Dto dto1 = new Dto(123, 0, 10);
        Dto dto2 = new Dto(124, 123, 20);
        Dto dto3 = new Dto(125, 123, 30);
        Dto dto4 = new Dto(126, 124, 40);

        List<Dto> dtos = new ArrayList<>();
        dtos.add(dto1);
        dtos.add(dto2);
        dtos.add(dto3);
        dtos.add(dto4);
        HashMap<Integer, List<Dto>> listHashMap = new HashMap<>();
        for (Dto dto : dtos) {
            List<Dto> tmp = new ArrayList<>();
            for (int i = 0; i < dtos.size(); i++) {
                if (dto.getId() == dtos.get(i).getIdParent()) {
                    tmp.add(dtos.get(i));
                }
            }
            listHashMap.put(dto.getId(), tmp);
        }
        listHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() +"-"+countBonus(entry.getValue()));
        });
    }
}
