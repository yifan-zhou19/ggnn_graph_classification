import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[251]);
		String num2 = new String(new char[251]);
		int[] a = new int[251];
		int[] b = new int[251];
		int[] d = new int[251];
		int len1;
		int len2;
		int i = 0;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d,0,(Integer.SIZE / Byte.SIZE));
		num1 = new Scanner(System.in).nextLine();
		num2 = new Scanner(System.in).nextLine();
		len1 = num1.length();
		len2 = num2.length();
		for (i = len1 - 1;i >= 0;i--)
		{
			a[j++] = num1.charAt(i) - '0';
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			b[j++] = num2.charAt(i) - '0';
		}
		for (i = 0;i < 251;i++)
		{
			if (a[i] != 0 || b[i] != 0)
			{
				break;
			}
			if (i = 250)
			{
				System.out.print("0");
				return 0;
			}
		}
		//for(i=0;i<len1;i++){cout<<a[i];}
		//cout<<endl;
		//for(i=0;i<len2;i++){cout<<b[i];}
		//cout<<endl;
		for (i = 0;i < 251;i++)
		{
			if ((a[i] + b[i] + d[i]) >= 10)
			{
				d[i] = d[i] + a[i] + b[i] - 10;
				d[i + 1] = 1;
			}
			else
			{
				d[i] = d[i] + a[i] + b[i];
			}
		}
		for (j = 250;j >= 0;j--)
		{
			if (d[j] != 0)
			{
				break;
			}
		}
		for (i = j;i >= 0;i--)
		{
			System.out.print(d[i]);
		}
		return 0;
	}
}
