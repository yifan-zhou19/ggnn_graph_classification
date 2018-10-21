package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		cin.get(a,31,'\n');

		int i = 0;
		for (;a.charAt(i) != 0;i++)
		{
			if (!(a.charAt(i) > 47 && a.charAt(i) < 58))
			{
				continue;
			}
			int j = i;
			for (;j <= 30;i++,j++)
			{
				if (a.charAt(j) > 47 && a.charAt(j) < 58)
				{
					System.out.print(a.charAt(j));
				}
				else
				{
					System.out.print("\n");
					break;
				}
			}
		}


		return 0;
	}
}
