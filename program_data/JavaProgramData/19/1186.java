package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] p = new String[100];
		String a;
		String b;
		char c;
		int i;
		int n;
		int m;
		int l;
		for (i = 0;i <= 100;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[i] = (String)malloc(100);
		}
		for (i = 0,n = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i] = tempVar.charAt(0);
			}
			n++;
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(10);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(10);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			if (strcmp(p[i],a) == 0)
			{
				p[i] = b;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",p[i]);
			if (i != n - 1)
			{
				System.out.print(" ");
			}
		}
	}
}

