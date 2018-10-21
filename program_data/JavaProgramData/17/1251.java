package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			char[] exp = (String)malloc((Character.SIZE / Byte.SIZE) * MAX_LEN);
			int[] res = new int[MAX_LEN];
			while (gets(exp))
			{
					int cur = 0;
					int pt = 0;
					int len = exp.length();
					for (int i = 0;i != MAX_LEN;++i)
					{
							res[i] = -1;
					}
					for (;cur != len;++cur)
					{
							if (exp[cur] != '(' && exp[cur] != ')')
							{
									res[cur] = 0;
							}
							if (exp[cur] == ')')
							{
									for (pt = cur - 1;pt >= 0;--pt)
									{
											if (exp[pt] == '(' && res[pt] != 0)
											{
													res[pt] = 0;
													res[cur] = 0;
													break;
											}
									}
							}
					}
					System.out.println(exp);
					for (int i = 0;i != len;++i)
					{
							if (exp[i] == '(' && res[i] == -1)
							{
									res[i] = 1;
							}
							else if (exp[i] == ')' && res[i] == -1)
							{
									res[i] = 2;
							}
							switch (res[i])
							{
							case 0:
									System.out.print(' ');
									break;
							case 1:
									System.out.print('$');
									break;
							case 2:
									System.out.print('?');
									break;
							}
					}
					System.out.print("\n");
			}
			return 0;
	}
}
