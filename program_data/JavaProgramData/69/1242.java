//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void jin(tangible.RefObject<String> ci, tangible.RefObject<String> ai, int k)
	{
		if (k != 0)
		{
			//printf("k-1%d\n",k-1);
			ai.argValue.charAt(k) -= 10;
			ai.argValue.charAt(k - 1)++;
			if (ai.argValue.charAt(k - 1) < 58 && ai.argValue.charAt(k - 1) >= 48)
			{
				//printf("diaoyong\n");
				return;
			}
			else if (ai.argValue.charAt(k - 1) >= 58 && k != 0)
			{
				jin(ci, ai, k - 1);
			}
		}
		if (k == 0)
		{
			//printf("diaoyong\n");
			ai.argValue.charAt(k) -= 10;
			ci.argValue.charAt(0) = 49;
		}
	}

	public static void jin2(tangible.RefObject<String> ci, tangible.RefObject<String> bi, int j)
	{
		if (j != 0)
		{
			//printf("k-1%d\n",k-1);
			bi.argValue.charAt(j) -= 10;
			bi.argValue.charAt(j - 1)++;
			if (bi.argValue.charAt(j - 1) < 58 && bi.argValue.charAt(j - 1) >= 48)
			{
				//printf("diaoyong\n");
				return;
			}
			else if (bi.argValue.charAt(j - 1) >= 58 && j != 0)
			{
				jin(ci, bi, j - 1);
			}
		}
		if (j == 0)
		{
			//printf("diaoyong\n");
			bi.argValue.charAt(j) -= 10;
			ci.argValue.charAt(0) = 49;
		}
	}



	public static int Main()
	{
		String a = new String(new char[n]);
		String b = new String(new char[n]);
		String ai;
		String bi;
		String ci;
		ai = a.charAt(0);
		bi = b.charAt(0);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ai = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bi = tempVar2.charAt(0);
		}
		int i = 0;
		int k = 0;
		do
		{
			if (a.charAt(i) != '\0')
			{
				i++;
			}
		}while (a.charAt(i) != '\0');
		k = i;
		int j;
		i = 0;
		do
		{
			if (b.charAt(i) != '\0')
			{
				i++;
			}
		}while (b.charAt(i) != '\0');
		j = i;
		if (k >= j)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			ci = (String) malloc((k + 2) * (Character.SIZE / Byte.SIZE));
			ci.charAt(k + 1) = '\0';
			for (; k >= 1 ;k--,j--)
			{
				if (j >= 1)
				{
					ci.charAt(k) = a.charAt(k - 1) + b.charAt(j - 1) - 48;
					if (ci.charAt(k) >= 58)
					{
						ci.charAt(k) -= 10;
						if (k != 1)
						{
							ai.charAt(k - 2)++;
							if (ai.charAt(k - 2) >= 58)
							{
							tangible.RefObject<String> tempRef_ci = new tangible.RefObject<String>(ci);
							tangible.RefObject<String> tempRef_ai = new tangible.RefObject<String>(ai);
								jin(tempRef_ci, tempRef_ai, k - 2);
								ai = tempRef_ai.argValue;
								ci = tempRef_ci.argValue;
							}
						}
						if (k == 1)
						{
							ci.charAt(0) = 49;
						}
					}
				}
				else if (j < 1)
				{
					ci.charAt(k) = a.charAt(k - 1);
				}
			}
			i = 0;
			int l = 0;
			do
			{
				if (ci.charAt(i) >= 49 && ci.charAt(i) <= 57 && ci.charAt(i) != '\0' && l == 0)
				{
					System.out.printf("%c",ci.charAt(i));
					l++;
					i++;
				}
				else if (ci.charAt(i) >= 48 && ci.charAt(i) <= 57 && ci.charAt(i) != '\0' && l == 1)
				{
					System.out.printf("%c",ci.charAt(i));
					i++;
				}
				else
				{
					i++;
				}
			}while (ci.charAt(i) != '\0');
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(ci);
		}
		if (k < j)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			ci = (String) malloc((j + 2) * (Character.SIZE / Byte.SIZE));
			ci.charAt(j + 1) = '\0';
			for (; j >= 1 ;j--,k--)
			{
				if (k >= 1)
				{
					ci.charAt(j) = b.charAt(j - 1) + a.charAt(k - 1) - 48;
					if (ci.charAt(j) >= 58)
					{
						ci.charAt(j) -= 10;
						if (j != 1)
						{
							bi.charAt(j - 2)++;
							if (bi.charAt(j - 2) >= 58)
							{
							tangible.RefObject<String> tempRef_ci2 = new tangible.RefObject<String>(ci);
							tangible.RefObject<String> tempRef_bi = new tangible.RefObject<String>(bi);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


