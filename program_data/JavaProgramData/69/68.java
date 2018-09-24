import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k1 = 0;
		int k2 = 0;
		int i;
		int[] a1 = new int[250];
		int[] b1 = new int[250];
		int[] sum = new int[251];
		int lena;
		int lenb;
		int max;
		String a = new String(new char[250]);
		String b = new String(new char[250]);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		while (a.charAt(k1) == '0')
		{
			k1++;
		}
		while (b.charAt(k2) == '0')
		{
			k2++;
		}
		for (lena = 0;a.charAt(lena) != '\0';lena++)
		{
			;
		}
		for (lenb = 0;b.charAt(lenb) != '\0';lenb++)
		{
			;
		}


		if ((k1 != lena) || (k2 != lenb))
		{
		for (i = lena - 1;i >= k1;i--)
		{
			a1[lena - i - 1] = a.charAt(i) - '0';
		}
		for (i = lenb - 1;i >= k2;i--)
		{
			b1[lenb - i - 1] = b.charAt(i) - '0';
		}

		lena = lena - k1;
		lenb = lenb - k2;
		if (lena > lenb)
		{
			max = lena;
		}
		else
		{
			max = lenb;
		}
		}
		else
		{
			a1[0] = 0;
			b1[0] = 0;
			max = 1;
		}



		for (i = 0;i < max;i++)
		{
			sum[i] = sum[i] + a1[i] + b1[i];
			if (sum[i] >= 10)
			{
				  sum[i] = sum[i] - 10;
			   sum[i + 1]++;
			}

		}

		if (sum[max] != 0)
		{
			max++;
		}
		for (i = max - 1;i >= 0;i--)
		{
			System.out.print(sum[i]);
		}

		return 0;
	}





}
