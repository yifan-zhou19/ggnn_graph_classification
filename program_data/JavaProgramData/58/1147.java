package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int i;
	int j;
	int x;
	int y = 0;
	int z;
	String s = new String(new char[81]);
	char c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (i = 1;i <= a;i++)
	{

		s = new Scanner(System.in).nextLine();
		x = 1;
		for (j = 0;s.charAt(j) != '\0';j++)
		{
			if (j == 0 && !(s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') && !(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') && s.charAt(j) != '_')
			{
				 x = 0;
				 break;
			}
			else if (j > 0 && !(s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') && !(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') && s.charAt(j) != '_' && !(s.charAt(j) >= '0' && s.charAt(j) <= '9'))
			{
			   x = 0;
			   break;
			}

		}
	System.out.printf("%d\n",x);
	}
	}

}

