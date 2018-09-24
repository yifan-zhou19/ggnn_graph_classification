package <missing>;

public class GlobalMembers
{
	public static int huan(char k)
	{
		if (k <= 57)
		{
			return k - 48;
		}
		else if (k >= 97 && k <= 122)
		{
			return k - 87;
		}
		else if (k >= 65 && k <= 90)
		{
			return k - 55;
		}
		return 0;
	}
	public static char huan2(int k)
	{
		if (k <= 9)
		{
			return k + 48;
		}
		if (k >= 10)
		{
			return k + 55;
		}
		return 0;
	}

	public static int Main()
	{
		int a;
		int b;
		String ps;
		String result;
		int[] tmp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		ps = (String) malloc((Integer.SIZE / Byte.SIZE) * 8);
		tmp = new int[8];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		result = (String) malloc((Integer.SIZE / Byte.SIZE) * 8);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ps = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int k = ps.length();
		int i;
		int tmp2 = 0;
		for (i = 0;ps.charAt(i) != '\0';i++)
		{
			tmp[i] = huan(ps.charAt(i));
			tmp2 += (int)(tmp[i] * Math.pow(a,k - 1 - i));
			//printf("t%ld\n",(long) (tmp[i] * pow(a,k-1-i)));
		}
		//printf("t%ld\n",tmp2);
		int l = i - 1;
		int[] tmp3 = new int[8];
		for (l = 0 ; tmp2 != 0; l++)
		{
			tmp3[l] = tmp2 % b;
			//printf("t3 %d l%d\n",tmp3[l],l);
			tmp2 = tmp2 / b;
			//printf("l%d\n",l);
		}
		//printf("l%d\n",l);
		int m;
		l--;
		for (m = 0;l >= 0;l--,m++)
		{
			result.charAt(m) = huan2(tmp3[l]);
			//printf("r%c l%d\n",result[m],l);
		}
		result.charAt(m) = '\0';
		System.out.printf("%s",result);
		System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			 free(ps);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			 free(tmp);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			 free(result);
		return 0;
	}

}

