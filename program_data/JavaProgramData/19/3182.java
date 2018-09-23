package <missing>;

public class GlobalMembers
{
		public static char[][] sentence = new char[100][100];
		public static String a = new String(new char[100]);
		public static String b = new String(new char[100]);

	public static int Main()
	{
		int cnt = 1;
		while (scanf("%s",sentence[cnt]) != EOF)
		{
			cnt++;
		}
		cnt--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(a,sentence[cnt - 1],(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(b,sentence[cnt],(Character.SIZE / Byte.SIZE));
		for (int i = 1;i < cnt - 1;i++)
		{
			if (i != 1)
			{
				System.out.print(" ");
			}
			if (strcmp(sentence[i],a) == 0)
			{
				System.out.printf("%s",b);
			}
				else
				{
					System.out.printf("%s",sentence[i]);
				}
		}
		System.out.print("\n");
		return 0;
	}
}
