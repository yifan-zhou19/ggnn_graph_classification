package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[300][100];
		String max = new String(new char[100]);
		String min = new String(new char[100]);
		int ma = 0;
		int mi = 100;
		int i;
		int j;
		int a;

		for (i = 0;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s[i],0,(Character.SIZE / Byte.SIZE));
			for (j = 0;;j++)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					s[i][j] = tempVar.charAt(0);
				}
				if (s[i][j] == ' ' || s[i][j] == '\n')
				{
					if (s[i][j - 1] == ',')
					{
						a = String.valueOf(s[i]).length() - 1;
						if (a > ma)
						{
							ma = a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							memset(max,0,(Character.SIZE / Byte.SIZE));
							max = String.valueOf(s[i]).substring(0, a);
						}
						if (a < mi)
						{
							mi = a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							memset(min,0,(Character.SIZE / Byte.SIZE));
							min = String.valueOf(s[i]).substring(0, a);
						}
						break;
					}
					//printf("m\n");
					else
					{
						a = String.valueOf(s[i]).length();
						if (a > ma)
						{
							ma = a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							memset(max,0,(Character.SIZE / Byte.SIZE));
							max = String.valueOf(s[i]).substring(0, a - 1);
						}
						if (a < mi)
						{
							mi = a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							memset(min,0,(Character.SIZE / Byte.SIZE));
							min = String.valueOf(s[i]).substring(0, a - 1);
						}
						break;
					}
				}
			}
			if (s[i][j] == '\n')
			{
				break;
			}
		}
		System.out.printf("%s\n%s",max,min);
	}
}

