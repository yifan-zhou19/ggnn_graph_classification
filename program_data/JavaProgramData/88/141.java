import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[31]);
	a = new Scanner(System.in).nextLine();
	int d;
	int i;
	d = a.length();
	int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(b,-1,(Integer.SIZE / Byte.SIZE));
	int num = 0;
	int sum = 0;
	for (i = 0;i < d;i++)
	{
		if ((a.charAt(i) < 58) && (a.charAt(i)>47))
		{
			sum = sum * 10 + (int)(a.charAt(i) - 48);
			b[num] = sum;
		}
		else
		{
			num++;
			sum = 0;
		}
	}
	for (i = 0;i < 100;i++)
	{
		if (b[i] >= 0)
		{
		System.out.print(b[i]);
		System.out.print("\n");
		}
		else
		{
			continue;
		}
	}
	return 0;
	}
}
