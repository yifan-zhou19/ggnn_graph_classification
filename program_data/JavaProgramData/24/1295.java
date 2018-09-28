package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int max;
		int min;
		String p = new String(new char[30]);
		int[] q;
		q = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (char[30])malloc(100 * 30 * (Character.SIZE / Byte.SIZE));
		for (i = 0;scanf("%s", p.charAt(i)) != EOF;i++)
		{
			q[i] = String.valueOf(p.charAt(i)).length();
		}
		max = 0;
		for (j = 0;j < i;j++)
		{
			if (max < q[j])
			{
				max = q[j];
			}
		}
		for (j = 0;j < i;j++)
		{
			if (max == q[j])
			{
				System.out.printf("%s\n",p.charAt(j));
				break;
			}
		}
		min = max + 1;
		for (j = 0;j < i;j++)
		{
			if (min > q[j])
			{
				min = q[j];
			}
		}
		for (j = 0;j < i;j++)
		{
			if (min == q[j])
			{
				System.out.printf("%s",p.charAt(j));
				break;
			}
		}
	}
}
