import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String firstline = new String(new char[10000]); //??????????????????????????????????????
		String secondline = new String(new char[10000]);
		String temp = new String(new char[100]);
		int[] enter = new int[3000]; //????
		int[] exit = new int[3000];
		int k = 0;
		int i;
		int g = 0;
		int j;
		int num;
		int min = 1000;
		int max = 0;
		int[] point = new int[1000];
		int result = 0;
		firstline = new Scanner(System.in).nextLine(); //?????????
		secondline = new Scanner(System.in).nextLine(); //?????????
		for (i = 0;i <= firstline.length();i++)
		{
			if (firstline.charAt(i) != ',' && firstline.charAt(i) != '\0') //???????????
			{
			temp = tangible.StringFunctions.changeCharacter(temp, k, firstline.charAt(i)); //????????????temp???
			k++;
			}
			else
			{
			enter[g] = Integer.parseInt(temp); //?????temp???????????????enter???
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp,0,(Character.SIZE / Byte.SIZE)); //?temp??????
			g++; //???
			k = 0; //??
			}
		}
		num = g; //g?????????
		g = 0; //???0?????????
		for (i = 0;i <= secondline.length();i++) //????
		{
			if (secondline.charAt(i) != ',' && secondline.charAt(i) != '\0')
			{
			temp = tangible.StringFunctions.changeCharacter(temp, k, secondline.charAt(i));
			k++;
			}
			else
			{
			exit[g] = Integer.parseInt(temp);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp,0,(Character.SIZE / Byte.SIZE));
			g++;
			k = 0;
			}
		}
		for (i = 0;i < num;i++) //??????????
		{
			if (enter[i] < min)
			{
				min = enter[i];
			}
		}
		for (i = 0;i < num;i++) //??????????
		{
			if (exit[i] > max)
			{
				max = exit[i];
			}
		}
		for (i = min;i < max;i++) //????????????????
		{
			for (j = 0;j < num;j++) //????????
			{
				if (enter[j] <= i != 0 && exit[j]> i)
				{
					point[i]++; //????????????????????1
				}
			}
		}


		for (i = min;i < max;i++)
		{
			if (point[i] >= result)
			{
				result = point[i]; //?point???????
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(result);
		return 0;
	}

}

