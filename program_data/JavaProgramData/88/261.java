package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String zifu = new String(new char[30]);
		int i;

		zifu = new Scanner(System.in).nextLine(); //?????

		for (i = 0;i < zifu.length();i++)
		{ //?????????????
		if (zifu.charAt(i) >= '0' && zifu.charAt(i) <= '9')
		{
		/*????????'',??????
												???????????0-9????*/
			System.out.printf("%c",zifu.charAt(i));
		}
		else
		{
			if ((zifu.charAt(i) < '0' || zifu.charAt(i)>'9') && (zifu.charAt(i - 1) >= '0' && zifu.charAt(i - 1) <= '9'))
			{
			System.out.print("\n"); //????????
			}
		}
		}

	}

}
