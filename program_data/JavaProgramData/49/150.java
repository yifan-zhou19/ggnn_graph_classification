import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		int i;
		int j;
		int k;
		int l = 0;
		int length;
		int t1;
		int t2;
		int t;
		int[] a = new int[501];
		int[] b = new int[501];
		int[] leng = new int[501];
		str = new Scanner(System.in).nextLine();
		length = str.length();
		for (i = 0; i < length; i++)
		{
			  for (j = i + 1; j < length; j++)
			  {
					if (str.charAt(i) == str.charAt(j))
					{
							  for (k = i + 1; k <= (j + i) / 2; k++)
							  {
									if (str.charAt(k) == str.charAt(i + j - k))
									{
										  continue;
									}
									else
									{
										  break;
									}
							  }
							  if (k - 1 == (j + i) / 2)
							  {
								   a[l] = i;
								   b[l] = j;
								   leng[l] = j - i;
								   l++;
							  }
					}
			  }
		}
		for (i = 0; i < l - 1; i++)
		{
			  for (j = 0; j < l - i - 1; j++)
			  {
					if (leng[j] > leng[j + 1])
					{
							   t1 = b[j + 1];
							   b[j + 1] = b[j];
							   b[j] = t1;
							   t2 = a[j + 1];
							   a[j + 1] = a[j];
							   a[j] = t2;
							   t = leng[j + 1];
							   leng[j + 1] = leng[j];
							   leng[j] = t;
					}
			  }
		}
		for (i = 0; i < l; i++)
		{
			  while (a[i] <= b[i])
			  {
						 System.out.print(str.charAt(a[i]));
						 a[i]++;
			  }
			  System.out.print("\n");
		}
		return 0;
	}

}
