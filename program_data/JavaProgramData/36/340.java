package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str1 = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str2 = tempVar2.charAt(0);
	}
	int[] sum1 = new int[26];
	int[] sum2 = new int[26];
	int[] sum3 = new int[26];
	int[] sum4 = new int[26];
	int n1 = str1.length();
	int n2 = str2.length();
	int i;
	int j;
	int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(sum1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(sum2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(sum3,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(sum4,0,(Integer.SIZE / Byte.SIZE));
	for (i = 0;i < n1;i++)
	{
		if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
		{
			sum1[(str1.charAt(i) - 'a')]++;
		}
		if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
		{
			sum2[(str1.charAt(i) - 'A')]++;
		}
	}
	for (i = 0;i < n2;i++)
	{
		if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
		{
			sum3[(str2.charAt(i) - 'a')]++;
		}
		if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
		{
			sum4[(str2.charAt(i) - 'A')]++;
		}
	}
	for (j = 0;j < 26;j++)
	{
		if ((sum1[j] != sum3[j]) || (sum2[j] != sum4[j]))
		{
			k++;
		}
	}
	if (k == 0)
	{
		System.out.print("YES");
	}
	else
	{
		System.out.print("NO");
	}

	}


}

