package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int i;
		int flag;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if ((int)str.charAt(i) < 58 && (int)str.charAt(i)>47)
			{
				System.out.print(str.charAt(i));
				flag = 1;
			}
			else if (flag == 1)
			{
				System.out.print("\n");
				flag = 0;
			}
		}
		System.out.print("\n");
		return 0;
	}



}
