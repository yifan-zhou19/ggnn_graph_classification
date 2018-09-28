package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (int i = 1;i <= n;i++)
	{
	String s = new String(new char[100]);
	s = new Scanner(System.in).nextLine();
	int len = s.length();
	int flag = (s.charAt(0) == '_' || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'));
	for (int j = 1;j < len;j++)
	{
	flag &= (s.charAt(j) == '_' || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'));
	}
	System.out.printf("%d\n",flag);
	}
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

