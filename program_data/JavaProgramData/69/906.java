import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

	String s1 = new String(new char[251]);
	String s2 = new String(new char[251]);
	int[] sum = new int[251];
	int flag = 0;



	int i;
	int j;
	int k;

	int len1;
	int len2;

	int min;
	int max;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(s1,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(s2,0,(Character.SIZE / Byte.SIZE));
	s1 = new Scanner(System.in).nextLine();
	s2 = new Scanner(System.in).nextLine();

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(sum,0,(Integer.SIZE / Byte.SIZE));




	len1 = s1.length();
	len2 = s2.length();


	min = (len1 > len2)? len2:len1;
	max = (len1 > len2)? len1:len2;


	for (i = min - 1;i >= 0;i--)
	{
		sum[max - (min - 1 - i)] = s2.charAt(len2 - 1 - (min - 1 - i)) - '0' + s1.charAt(len1 - 1 - (min - 1 - i)) - '0';

	}

	if (max == len1)
	{
	for (i = max - min;i >= 1;i--)
	{
		sum[i] = s1.charAt(i - 1) - '0';
	}
	}
	else
	{
		for (i = max - min;i >= 1;i--)
		{
		sum[i] = s2.charAt(i - 1) - '0';
		}
	}



	for (i = max;i >= 1;i--)
	{
		sum[i - 1] = sum[i - 1] + sum[i] / 10;
		sum[i] = sum[i] % 10;
	}
	j = 0;
	while (sum[j] == 0 && j <= max)
	{
		j++;


	}

	if (sum[j] != 0)
	{
		for (i = j;i <= max;i++)
		{
			System.out.print(sum[i]);
		}
	}

	else
	{
		System.out.print(0);
	}











		return 0;

	}


}
