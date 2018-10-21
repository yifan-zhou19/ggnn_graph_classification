package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[500]);
		int i;
		int j = 0;
		int len;
		int kong = 0;
		int shuliang;
		int[] num = new int[50];
		int max = 0;
		int k;
		int r;
		int min = 100;
		int qian1 = 0;
		int qian2 = 0;
		sentence = new Scanner(System.in).nextLine();
		len = sentence.length();
		for (i = 0;i < len;i++)
		{
			if (sentence.charAt(i) == ' ')
			{
				kong++;
			}
		}
		shuliang = kong + 1;

		for (i = 0;i < shuliang;i++)
		{
			for (;j < len;j++)
			{
				if (sentence.charAt(j) != ' ')
				{
					num[i]++;
				}
				else
				{
					j++;
					break;
				}
			}
		}
		for (i = 0;i < shuliang;i++)
		{
			if (num[i] > max)
			{
				k = i;
				max = num[i];
			}
			if (num[i] < min)
			{
				r = i;
				min = num[i];
			}
		}
		for (i = 0;i < k;i++)
		{
			qian1 = qian1 + num[i];
		}
		for (i = 0;i < r;i++)
		{
			qian2 = qian2 + num[i];
		}
		for (i = qian1 + k;i < num[k] + qian1 + k;i++)
		{
			System.out.printf("%c",sentence.charAt(i));
		}
		System.out.print("\n");
		for (i = qian2 + r;i < num[r] + qian2 + r;i++)
		{
			System.out.printf("%c",sentence.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}
