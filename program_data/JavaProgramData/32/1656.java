import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int i;
		int j;
		int k;
		int l1;
		int l2;
		String x = new String(new char[201]);
		String y = new String(new char[201]);
		int[] a = new int[201];
		int[] b = new int[201];
		for (k = 0;k < n - 1;k++)
		{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(x,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(y,0,(Character.SIZE / Byte.SIZE));
			x = new Scanner(System.in).nextLine();
			y = new Scanner(System.in).nextLine();
			System.in.read();
			l1 = x.length();
			l2 = y.length();
			//  cout<<x<<endl;
			//  cout<<y<<endl;
			for (i = 0,j = l1 - 1;i < l1;i++,j--)
			{
				a[j] = x.charAt(i) - '0';
			}
			for (i = 0,j = l2 - 1;i < l2;i++,j--)
			{
				b[j] = y.charAt(i) - '0';
			}
			for (i = 0;i < l2;i++)
			{
				a[i] = a[i] - b[i];
				if (a[i] < 0)
				{
					a[i] = a[i] + 10;
					a[i + 1] = a[i + 1] - 1;
				}
			}
			for (i = 200;i >= 0;i--)
			{
				if (a[i] != 0)
				{
				break;
				}
			}
			for (i = i;i >= 0;i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(x,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(y,0,(Character.SIZE / Byte.SIZE));
			x = new Scanner(System.in).nextLine();
			y = new Scanner(System.in).nextLine();
			l1 = x.length();
			l2 = y.length();
			//  cout<<x<<endl;
			//  cout<<y<<endl;
			for (i = 0,j = l1 - 1;i < l1;i++,j--)
			{
				a[j] = x.charAt(i) - '0';
			}
			for (i = 0,j = l2 - 1;i < l2;i++,j--)
			{
				b[j] = y.charAt(i) - '0';
			}
			for (i = 0;i < l2;i++)
			{
				a[i] = a[i] - b[i];
				if (a[i] < 0)
				{
					a[i] = a[i] + 10;
					a[i + 1] = a[i + 1] - 1;
				}
			}
			for (i = 200;i >= 0;i--)
			{
				if (a[i] != 0)
				{
				break;
				}
			}
			for (i = i;i >= 0;i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");

		return 0;
	}
}

