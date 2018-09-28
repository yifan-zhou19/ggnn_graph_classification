//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 10, 100, 1000, 10000, 100000, 1000000, 1000000, 100000000};
		int i;
		int j;
		int k;
		int n;
		int m;
		int p;
		int t = 1;
		int l = 0;
		int r;
		int s;
		int o;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (r = 0;r < 9;r++)
		{
			if (n / a[r] == 0)
			{
				break;
			}
		}
		for (s = 0;s < 9;s++)
		{
			if (m / a[s] == 0)
			{
				break;
			}
		}
		for (o = r;o <= s;o++)
		{
			k = o;
		if (k % 2 == 0)
		{
			k = k / 2;
			for (i = a[k - 1];i < a[k];i++)
			{
				p = i * a[k];
				l = i;
				for (j = 0;j < k;j++)
				{
					p = p + (l / a[k - j - 1]) * a[j];
					l = l % a[k - j - 1];
				}
				if (p > m)
				{
					break;
				}
				if (p >= n)
				{
				for (j = 2;j < Math.sqrt((double)p) + 1;j++)
				{
					if (p % j == 0)
					{
						break;
					}
				}
				if (j == Math.sqrt((double)p) + 1)
				{
					System.out.print("%d");
					t = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
				}
			}
		}
		else
		{
			k = k / 2 + 1;
			for (i = a[k - 1];i < a[k];i++)
			{
				p = i * a[k - 1];
				l = i;
				for (j = 0;j < k - 1;j++)
				{
					p = p + (l / a[k - j - 1]) * a[j];
					l = l % a[k - j - 1];
				}
				if (p > m)
				{
					break;
				}
				if (p >= n)
				{
				for (j = 2;j < (int)Math.sqrt((double)p) + 1;j++)
				{
					if (p % j == 0)
					{
						break;
					}
				}
				if (j == (int)Math.sqrt((double)p) + 1)
				{
					System.out.printf("%d",p);
					t = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
				}
			}
		}
		if (p > m)
		{
			break;
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
		i++;
		for (;o <= s;o++)
		{
			k = o;
		if (k % 2 == 0)
		{
			k = k / 2;
			for (;i < a[k];i++)
			{
				p = i * a[k];
				l = i;
				for (j = 0;j < k;j++)
				{
					p = p + (l / a[k - j - 1]) * a[j];
					l = l % a[k - j - 1];
				}
				if (p > m)
				{
					break;
				}
				if (p >= n)
				{
				for (j = 2;j < Math.sqrt((double)p) + 1;j++)
				{
					if (p % j == 0)
					{
						break;
					}
				}
				if (j == Math.sqrt((double)p) + 1)
				{
					System.out.print(",%d");
					t = 0;
				}
				}
			}
		}
		else
		{
			k = k / 2 + 1;
			for (;i < a[k];i++)
			{
				p = i * a[k - 1];
				l = i;
				for (j = 0;j < k - 1;j++)
				{
					p = p + (l / a[k - j - 1]) * a[j];
					l = l % a[k - j - 1];
				}
				if (p > m)
				{
					break;
				}
				if (p >= n)
				{
				for (j = 2;j < (int)Math.sqrt((double)p) + 1;j++)
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


