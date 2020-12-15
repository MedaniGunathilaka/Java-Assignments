public class WordCount
{

    public static void main(String[] args)
    {       
        String text = "UCSC offers Computer Science and Software Engineering education under the Bachelor of Computer Science and Information Systems under Bachelor of Information Systems intakes through the University Grants Commission as internal students such as Bachelor of Science in Computer Science, Bachelor of Science in Information Systems, Bachelor of Science Honours in Computer Science, Bachelor of Science Honours in Software Engineering, Bachelor of Science Honours in Information Systems";
        String text1=text.replaceAll(",","");
        String[] keys = text1.split(" ");
        String[] uniqueKeys;
        int count = 0;
        System.out.println(text1);
        uniqueKeys = getUniqueKeys(keys);

        for(String key: uniqueKeys)
        {
            if(null == key)
            {
                break;
            }           
            for(String s : keys)
            {
                if(key.equals(s))
                {
                    count++;
                }               
            }
            System.out.println("Count of ["+key+"] is : "+count);
            count=0;
        }
    }

    private static String[] getUniqueKeys(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];

        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;

        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }           

            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;               
            }
            keyAlreadyExists = false;
        }       
        return uniqueKeys;
    }
}