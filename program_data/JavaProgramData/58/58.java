package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		char c;
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (z = 0;z < n;z++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
			p = new Scanner(System.in).nextLine();
			l = p.length();
			k = 1;
			if (!(p == '_' || (p <= 'Z' && p >= 'A') || (p <= 'z' && p >= 'a')))
			{
				System.out.print("0\n");
				continue;
			}
			for (i = 1;i < l;i++)
			{
				c = (p.Substring(i));
				if (!(c == '_' || (c <= 'Z' && c >= 'A') || (c <= 'z' && c >= 'a') || (c <= '9' && c >= '0')))
				{
				System.out.print("0\n");
				k = 0;
				break;
				}
			}
			if (k != 0)
			{
				System.out.print("1\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p);
		}
	}
}

