package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[1005];
	public static int[] in = new int[1000];
	public static int[] out = new int[1000];
	public static void Main()
	{
		String buf = new String(new char[4000]);
		String p;
		int count;
		int i;
		int j;
		int max = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(t, 0, (Integer.SIZE / Byte.SIZE));

		fgets(buf, (Character.SIZE / Byte.SIZE), stdin);
		i = 0;
		p = tangible.StringFunctions.strTok(buf, ",");
		for (; p != null; p = tangible.StringFunctions.strTok(null, ","))
		{
			in[i++] = Integer.parseInt(p);
		}
		count = i;

		fgets(buf, (Character.SIZE / Byte.SIZE), stdin);
		i = 0;
		p = tangible.StringFunctions.strTok(buf, ",");
		for (; p != null; p = tangible.StringFunctions.strTok(null, ","))
		{
			out[i++] = Integer.parseInt(p);
		}

		for (i = 0; i < count; i++)
		{
			int s = in[i];
			int e = out[i];
			for (j = s; j < e; j++)
			{
				t[j]++;
				if (max < t[j])
				{
					max = t[j];
				}
			}
		}

		System.out.printf("%d %d\n",count, max);
	}

}

