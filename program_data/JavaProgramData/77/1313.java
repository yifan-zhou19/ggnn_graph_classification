package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		char c;
		int num = 0;
		int[] b = new int[110];
		for (int i = 0;;i++)
		{
			cin.get(a.charAt(i));
			if (i == 0)
			{
				c = a.charAt(i);
			}
			if (a.charAt(i) == '\n')
			{
				break;
			}
			b[i] = i;
			num++;
		} //??
			int[] boy = new int[55];
			int[] girl = new int[55];
			int s = 0;
			for (int i = 0;i < num / 2;i++)
			{
				for (int j = 0;j < num - 1 - i * 2;j++)
				{
					if (a.charAt(j) != a.charAt(j + 1) && a.charAt(j) == c)
					{
						boy[s] = b[j];
						girl[s] = b[j + 1];
						s++; //??????
						for (int k = j + 2;k < num;k++)
						{
							a = tangible.StringFunctions.changeCharacter(a, k - 2, a.charAt(k));
							b[k - 2] = b[k];
						}
						continue;
					}
				}
			}
				for (int i = 0;i < num / 2 - 1;i++)
				{
					for (int j = 0;j < num / 2 - 1 - i;j++)
					{
						if (girl[j] > girl[j + 1])
						{
							int p;
							int q;
							p = boy[j];
							boy[j] = boy[j + 1];
							boy[j + 1] = p;
							q = girl[j];
							girl[j] = girl[j + 1];
							girl[j + 1] = q;
						}
					}
				} //????
					for (int i = 0;i < num / 2;i++)
					{
						System.out.print(boy[i]);
						System.out.print(" ");
						System.out.print(girl[i]);
						System.out.print("\n");
					}

				return 0;
	}


}

