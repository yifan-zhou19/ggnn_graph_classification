package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000]; //??????????????????????????
		int len1;
		int len2;
		int i;
		int j;
		int k;
		int sp = 0;
		int p = 0;
		int max = 0;
		int max1;
		int[] a = new int[1000];
		int[] entry = new int[1000]; //?????????
		int[] depart = new int[1000];
		String str1 = new String(new char[10000]); //????????????
		String str2 = new String(new char[10000]);
		String temp = new String(new char[5]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = str1.length();
		for (i = 0;i <= len1;i++) //?????????
		{
			if (str1.charAt(i) == ',')
			{
				k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(temp,'\0',(Character.SIZE / Byte.SIZE));
				for (j = sp;j < i;j++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k++, str1.charAt(j));
				}
				entry[p] = Double.parseDouble(temp);
				p += 1;
				sp = i + 1;
			}
			else if (str1.charAt(i) == '\0')
			{
				k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(temp,'\0',(Character.SIZE / Byte.SIZE));
				for (j = sp;j < i;j++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k++, str1.charAt(j));
				}
				entry[p] = Double.parseDouble(temp);
				sp = 0;
				p = 0;
			}
			else
			{
				continue;
			}
		}
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len2 = str2.length();
		for (i = 0;i <= len2;i++) //?????????
		{
			if (str2.charAt(i) == ',')
			{
				k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(temp,'\0',(Character.SIZE / Byte.SIZE));
				for (j = sp;j < i;j++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k++, str2.charAt(j));
				}
				depart[p] = Double.parseDouble(temp);
				p += 1;
				sp = i + 1;
			}
			else if (str2.charAt(i) == '\0')
			{
				k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(temp,'\0',(Character.SIZE / Byte.SIZE));
				for (j = sp;j < i;j++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k++, str2.charAt(j));
				}
				depart[p] = Double.parseDouble(temp);
				p += 1;
				System.out.print(p);
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < p;i++) //?????????
		{
			if (max < depart[i])
			{
				max = depart[i];
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		for (j = 0;j < max;j++)
		{
			a[j] = j + 1;
			for (i = 0;i < p;i++)
			{
				if (a[j] < depart[i] && a[j] >= entry[i])
				{
					num[j] += 1; //???????????
				}
			}
		}
		max1 = 0;
		for (i = 0;i < max;i++)
		{
			if (max1 < num[i])
			{
				max1 = num[i]; //????????????
			}
		}
		System.out.print(" ");
		System.out.print(max1);
		return 0;
	}
}

