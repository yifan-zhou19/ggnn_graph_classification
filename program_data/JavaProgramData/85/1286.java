package <missing>;

public class GlobalMembers
{
	public static final int M = 21;

	public static void Main(String[] args)
	{
		String s = new String(new char[M]);
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = n;
		while (i-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				//48-57 65-90 97-122
				if (!((s.charAt(j) == '_') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' && j>0) || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')))
				{
					break;
				}
			}
			System.out.print(s.charAt(j) ? "no\n":"yes\n");
		}
	}
}

