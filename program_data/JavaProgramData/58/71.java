package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int s = 0;
		int m = 0;
		String p;
		char c;
		char d;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			 p = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
			s = 0;
			m = 0;
			p = new Scanner(System.in).nextLine();
	for (j = 0;j < 80;j++)
	{
		if ((d = (p.Substring(j))) != '\0')
		{
			m++;
		}
	}
	for (j = 0;j < m;j++)
	{
		if ((d = (p.Substring(j))) >= '0' && (d = (p.Substring(j))) <= '9' || (d = (p.Substring(j))) >= 'A' && (d = (p.Substring(j))) <= 'Z' || (d = (p.Substring(j))) >= 'a' && (d = (p.Substring(j))) <= 'z' || (d = (p.Substring(j))) == '_')
		{
			s = s;
		}
		else
		{
			s = 1;
		}
	}
	if (s != 1 && (c = p) >= 'A' && (c = p) <= 'Z' || s != 1 && (c = p) >= 'a' && (c = p) <= 'z' || s != 1 && (c = p) == '_')
	{
		System.out.print("1\n");
	}
		else
		{
			System.out.print("0\n");
		}
		}




	}

}

