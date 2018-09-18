package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		String p1;
		String p2;
		String p3;
		String p;
		String s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p1 = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p3 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p2 = new Scanner(System.in).nextLine();
		p3 = new Scanner(System.in).nextLine();
		n = p1.length();
		s = p1;
			sscanf(s,"%s",p);
			m = p.length();
			if (strcmp(p2,p) == 0)
			{
				System.out.printf("%s",p3);
			}
			else
			{
				System.out.printf("%s",p);
			}
			s = s.Substring(m) + 1;
		for (i = n - m - 1;i >= 0;i = i - m - 1)
		{
			sscanf(s,"%s",p);
			m = p.length();
			if (strcmp(p2,p) == 0)
			{
				System.out.printf(" %s",p3);
			}
			else
			{
				System.out.printf(" %s",p);
			}
			s = s.Substring(m) + 1;
		}
	}
}
