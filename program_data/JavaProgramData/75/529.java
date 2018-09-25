package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012795-?????.cpp
	 *   ?????
	 *  Created on: 2010-12-19
	 *      Author: ??
	 */
	public static int Main() //?????
	{
		int len1;
		int len2;
		int i;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		int num = 1;
		int max = 0;
		int[] cishu = new int[1000000]; //?????????????????
		double[] a = new double[100000]; //??str1?????????
		double[] b = new double[100000]; //??str2?????????
		String str1 = new String(new char[100000]);
		String str2 = new String(new char[100000]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len1 = str1.length(),len2 = str2.length();
		for (i = 0;i < len1;i++) //?str1???double???
		{
			char[][] c = new char[1000][1000];
			if (str1.charAt(i) == ',')
			{
				a[k++] = Double.parseDouble(c[j]);
				j++;
				l = 0;
			}
			if (str1.charAt(i) != ',')
			{
				c[j][l] = str1.charAt(i);
				l++;
			}
			if (i == len1 - 1)
			{
				a[k] = Double.parseDouble(c[j]);
			}
		}
		j = 0,l = 0;
		for (i = 0;i < len2;i++) //?str2???double???
		{
			char[][] d = new char[1000][1000];
			if (str2.charAt(i) != ',')
			{
				d[j][l] = str2.charAt(i);
				l++;
			}
			if (str2.charAt(i) == ',')
			{
				b[m++] = Double.parseDouble(d[j]);
				j++;
				l = 0;
			}
			if (i == len2 - 1)
			{
			   b[m] = Double.parseDouble(d[j]);
			}
		}
		for (i = 0;i <= k;i++) //?????????????????cishu?
		{
			for (l = a[i];l < b[i];l++)
			{
				cishu[l]++;
				num++;
			}
		}
		for (m = 0;m < num + 5;m++) //???????????
		{
			if (cishu[m] > max)
			{
				max = cishu[m];
			}
		}
		System.out.print(k + 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0; //????
	}

}
