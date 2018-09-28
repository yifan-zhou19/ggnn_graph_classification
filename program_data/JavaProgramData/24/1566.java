package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dc = new String(new char[10000]);
		dc = new Scanner(System.in).nextLine();
		char[][] fz = new char[200][50];
		int len = dc.length();
		int i;
		int k = 0;
		int j = 0;
		int l = 0;
		int num = 1;
		int[] cd = new int[200];
		for (i = 0;i < len;i++)
		{
			if (dc.charAt(i) != 32)
			{
				fz[k][j] = dc.charAt(i);
				j++;
				cd[k]++;
			}
			else
			{
				num++;
				k++;
				j = 0;
			}
		}
		String max = new String(new char[50]);
		String min = new String(new char[50]);
		max = fz[0];
		min = fz[0];
		int zc = cd[0];
		int zd = cd[0];
		for (k = 0;k < num;k++)
		{
			if (cd[k] > zc)
			{
				max = fz[k];
				zc = cd[k];
			}
			if (cd[k] < zd)
			{
				min = fz[k];
				zd = cd[k];
			}

			if ((cd[k] == zc) && (cd[k] == zd))
			{
				l++;
			}
		}
		if (l != num)
		{
			System.out.printf("%s\n%s\n",max,min);
		}
		else
		{
			System.out.printf("%s\n%s\n",fz[0],fz[0]);
		}
		return 0;
	}







}
