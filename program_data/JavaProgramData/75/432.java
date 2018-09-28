import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*???1000012904-4.cpp
	  ???????????????
	  ?????
	  ???2010?11?25?
	*/
	public static int Main()
	{
		String come1 = new String(new char[10000]); //????????????????
		String leave1 = new String(new char[10000]);
		//?????????????????????????????????????????????????????
		int[] come2 = new int[10000];
		int[] leave2 = new int[10000];
		int[] num = new int[1001];
		int[] comma1 = new int[10000];
		int[] comma2 = new int[100000];
		int count = 0;
		int max = 0;
		int i;
		int j;
		int all;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(come2, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(leave2, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(comma1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(comma2, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE)); //???????
		come1 = new Scanner(System.in).nextLine();
		leave1 = new Scanner(System.in).nextLine(); //???????????
		for (i = 0; come1.charAt(i) != '\0'; i++)
		{
			if (come1.charAt(i) == ',')
			{
				comma1[count] = i;
				count++;
			}
		} //???????
		all = count + 1; //???????????1
		for (j = 0; j < comma1[0]; j++)
		{
			come2[0] = come2[0] * 10 + (come1.charAt(j) - '0');
		}
		for (i = 1; i < count; i++)
		{
			for (j = comma1[i - 1] + 1; j < comma1[i];j++)
			{
				come2[i] = come2[i] * 10 + (come1.charAt(j) - '0');
			}
		}
		for (j = comma1[count - 1] + 1; come1.charAt(j) != '\0'; j++)
		{
			come2[count] = come2[count] * 10 + (come1.charAt(j) - '0'); //?????????????????
		}
		count = 0;
		for (i = 0; leave1.charAt(i) != '\0'; i++)
		{
			if (leave1.charAt(i) == ',')
			{
				comma2[count] = i;
				count++;
			}
		}
		for (j = 0; j < comma2[0]; j++)
		{
			leave2[0] = leave2[0] * 10 + (leave1.charAt(j) - '0');
		}
		for (i = 1; i < count; i++)
		{
			for (j = comma2[i - 1] + 1; j < comma2[i];j++)
			{
				leave2[i] = leave2[i] * 10 + (leave1.charAt(j) - '0');
			}
		}
		for (j = comma2[count - 1] + 1; leave1.charAt(j) != '\0'; j++)
		{
			leave2[count] = leave2[count] * 10 + (leave1.charAt(j) - '0'); //??????????????????
		}
		for (i = 0; i < all; i++)
		{
			for (j = come2[i]; j < leave2[i]; j++)
			{
			num[j] = num[j] + 1; //??????????
			}
		}
		for (i = 0; i < 1001; i++)
		{
			if (max < num[i])
			{
				max = num[i];
			}
		} //????????????????
		System.out.print(all);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}
