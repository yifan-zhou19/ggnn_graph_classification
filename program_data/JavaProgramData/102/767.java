package <missing>;

public class GlobalMembers
{
	public static int cmp1(float a,float b)
	{
		if (a > b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int cmp2(float a,float b)
	{
		if (a < b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static float[] mail = new float[1000];
	public static float[] femail = new float[1000];
	public static String sex = new String(new char[1000]);
	public static int Main()
	{
		//freopen("D:\\1.txt","r",stdin);
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		j = 0;
		k = 0;
		float temp;
		for (i = 0;i < N;i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			temp = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(sex,"male") == 0)
			{
				mail[j++] = temp;
			}
			else
			{
				if (strcmp(sex,"female") == 0)
				{
				femail[k++] = temp;
				}
			}
		}
		sort(mail,mail + j,cmp1);
		sort(femail,femail + k,cmp1);
		for (i = j - 1;i >= 0;i--)
		{
			System.out.printf("%.2f ",mail[i]);
		}
		for (i = 0;i < k;i++)
		{
			if (i != k - 1)
			{
			System.out.printf("%.2f ",femail[i]);
			}
			else
			{
				System.out.printf("%.2f\n",femail[i]);
			}
		}
		return 0;
	}
}

