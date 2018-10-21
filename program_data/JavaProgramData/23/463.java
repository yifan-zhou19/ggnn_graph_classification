package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int num = 1; //total??????b??????????
		int[] b = new int[100];
		int total = 0;
		for (int i = 0;i < 100;i++)
		{
			cin.get(a.charAt(i));
			if (a.charAt(i) == '\n')
			{
				break;
			}
			total++;
			if (a.charAt(i) == ' ')
			{
				b[num] = i;
				num++;
			} //?????????????????b[1]
		}
			b[0] = -1;
			b[num] = total; //??????????????
			for (int i = num - 1;i >= 0;i--)
			{
				for (int j = b[i] + 1;j < b[i + 1];j++)
				{
					System.out.print(a.charAt(j));
				}
					if (i != 0)
					{
						System.out.print(" ");
					}
			}

				return 0;
	}
}
