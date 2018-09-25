package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p1;
		String p2;
		String p3;
		String p;
		String q;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p3 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p1 = new Scanner(System.in).nextLine();
		p2 = new Scanner(System.in).nextLine();
		p3 = new Scanner(System.in).nextLine();
		p = tangible.StringFunctions.strStr(p1,p2);
		if (p == 0)
		{
			System.out.printf("%s",p1);
		}
		else
		{
		for (i = 0; * (p1.Substring(i)) != '\0';i++)
		{
			*(q.Substring(i)) = *(p1.Substring(i));
			if (p1.Substring(i) == p)
			{
				break;
			}
		}
		for (j = 0; * (p3.Substring(j)) != '\0';j++)
		{
			*(q.Substring(i) + j) = *(p3.Substring(j));
		}
		for (k = i + p2.length(); * (p1.Substring(k)) != '\0';k++,j++)
		{
		*(q.Substring(i) + j) = *(p1.Substring(k));
		}
		*(q.Substring(i) + j) = '\0';
		System.out.printf("%s",q);
		}
	}
}

