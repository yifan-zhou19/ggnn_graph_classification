package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int z;
		int j;
		int k = 0;
		int l;
		int y;
		int x;
		int p = 1;
		String s;
		String a;
		String b;
		String[] o;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(110 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(110 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		o = (String)malloc(10 * sizeof(String));
		for (i = 0;i < 10;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			o[i] = (String)malloc(110 * (Character.SIZE / Byte.SIZE));
		}
		o[k] = new Scanner(System.in).nextLine();
		z = String.valueOf(o[k]).length();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		y = a.length();
		x = b.length();
		while (p == 1)
		{
			p = 0;
			for (i = 0;i < z;i++)
			{
				if (o[k][i] == a.charAt(0) && (o[k][i - 1] == ' ' || i == 0))
				{
					for (l = 1;l < y;l++)
					{
						if (a.charAt(l) != o[k][i + l])
						{
							break;
						}
					}
						if (l == y)
						{
							p = 1;
							for (j = 0;j < i;j++)
							{
								o[k + 1][j] = o[k][j];
							}
							for (j = i;j < i + x;j++)
							{
								o[k + 1][j] = b.charAt(j - i);
							}
							for (j = i + x;j < z - y + x;j++)
							{
								o[k + 1][j] = o[k][j + y - x];
							}
							k++;
							z = z - y + x;
							break;
						}
				}
			}
		}
		for (i = 0;i < z;i++)
		{
			System.out.printf("%c",o[k][i]);
		}
		System.out.print("\n");
	}
}

