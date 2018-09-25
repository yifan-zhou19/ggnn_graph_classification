package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p1;
		String p2;
		String a;
		String b;
		char c;
		int i;
		int j;
		int k;
		int n;
	do
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(200 * (Character.SIZE / Byte.SIZE));

		a = " ";
		b = " ";
		for (i = 0,c = (p1),k = 0; * (p1.Substring(i)) != '\0';i++)
		{
			if (*(p1.Substring(i)) > c)
			{
				c = (p1.Substring(i));
				k = i;
			}
		}
		a = p1.substring(0, k + 1);
		*(a.Substring(k) + 1) = '\0';
		a += p2;
		for (i = k + 1,j = 0; * (p1.Substring(i)) != '\0';i++,j++)
		{
			*(b.Substring(j)) = *(p1.Substring(i));
		}
		*(b.Substring(j)) = '\0';
		a += b;
		System.out.println(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p2);
	}while (scanf("%s%s",p1,p2) != EOF);
	}

}
