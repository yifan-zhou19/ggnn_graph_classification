package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[110]);
		int[] note = new int[110];
		int l;
		int r;
		while ((ch = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(note, 0, (Integer.SIZE / Byte.SIZE));
			for (int i = 0; ch.charAt(i) != '\0'; i++)
			{
				switch (ch.charAt(i))
				{
				case '(':
				{
					l = 0;
					r = 0;
					note[i] = 1;
					for (int j = i; ch.charAt(j) != '\0'; j++)
					{
						switch (ch.charAt(j))
						{
						case '(':
							l++;
							break;
						case ')':
							r++;
							break;
						default:
							break;
						}
						if (l == r)
						{
							note[i] = 0;
							break;
						}
					}
					break;
				}
				case ')':
				{
					l = 0;
					r = 0;
					note[i] = -1;
					for (int j = i; j >= 0; j--)
					{
						switch (ch.charAt(j))
						{
						case '(':
							l++;
							break;
						case ')':
							r++;
							break;
						default:
							break;
						}
						if (l == r)
						{
							note[i] = 0;
							break;
						}
					}
					break;
				}
				default:
					break;
				}
			}
			System.out.print(ch);
			System.out.print("\n");
			for (int i = 0; ch.charAt(i) != '\0'; i++)
			{
				switch (note[i])
				{
				case 1:
					System.out.print("$");
					break;
				case -1:
					System.out.print("?");
					break;
				case 0:
					System.out.print(" ");
					break;
				default:
					break;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

