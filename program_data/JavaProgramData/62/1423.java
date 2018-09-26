package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		String q;
		int i;
		int j;
		int knum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (i = 0,j = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				knum = 0;
				*(q.Substring(j)) = *(p.Substring(i));
				j++;
			}
			else
			{
				if (knum == 0)
				{
					*(q.Substring(j)) = *(p.Substring(i));
					j++;
				}
				knum++;
			}
		}
		*(q.Substring(j)) = '\0';
	   System.out.println(q);
	}
}
