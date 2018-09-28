package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String q;
		String r;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (String)malloc(1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		r = (String)malloc(1000);
		p = new Scanner(System.in).nextLine();
		q = new Scanner(System.in).nextLine();
		r = new Scanner(System.in).nextLine();
		int a;
		int b;
		int c;
		a = p.length();
		b = q.length();
		c = r.length();
		int i;
		int j;
		int k;
		int t = 1;
		for (i = 0;i < a;i++)
		{
			for (j = i,k = 0;j < i + b;j++,k++)
			{
				if (p.charAt(j) != q.charAt(k))
				{
					t = 0;
					break;
				}
			}
			if (k == b)
			{
				break;
			}
		}
		if (k == b)
		{
		for (j = 0;j < i;j++)
		{
			System.out.printf("%c",p.charAt(j));
		}
		System.out.printf("%s",r);
		for (j = i + b;j < a;j++)
		{
			System.out.printf("%c",p.charAt(j));
		}
		}
		else
		{
			System.out.printf("%s",p);
		}
	}


}
