package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long pow(unsigned long a,unsigned long b)
	public static int pow(int a,int b)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long temp,sout=1;
		int temp;
		int sout = 1;
		for (temp = 1;temp <= b;temp++)
		{
		sout = sout * a;
		}
		return sout;
	}

	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long ip,op,i,lenth,oplenth,cache,test=9999,mod;
		  int ip;
		  int op;
		  int i;
		  int lenth;
		  int oplenth;
		  int cache;
		  int test = 9999;
		  int mod;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long dec=0;
		  int dec = 0;
		  String num = new String(new char[100]);
		  char wei;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  ip = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  num = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  op = Integer.parseInt(tempVar3);
		  }
		  //printf("%d %s %d\n",ip,num,op);
		  lenth = num.length();
		  for (i = 0;i <= lenth;i++)
		  {
							  if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
							  {
							  num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(i) - 'a'+'A');
							  }
		  }
		  //printf("%s\n",num);
		  for (i = 0;i < lenth;i++)
		  {
							  if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
							  {
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: dec=dec+((unsigned long)num[i]-(unsigned long)'0')*pow(ip,lenth-i-1);
							  dec = dec + ((int)num.charAt(i) - (int)'0') * pow(ip, lenth - i - 1);
							  }
							  else
							  {
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: dec=dec+(10+(unsigned long)num[i]-(unsigned long)'A')*pow(ip,lenth-i-1);
							  dec = dec + (10 + (int)num.charAt(i) - (int)'A') * pow(ip, lenth - i - 1);
							  }
		  }
		  for (oplenth = 1;test >= op;oplenth++)
		  {
		  test = dec / pow(op, oplenth - 1);
		  }
		  oplenth--;
		  mod = dec;
		  //printf("%d\n",dec);
		  for (i = 0;i < oplenth;i++)
		  {
								 cache = mod / pow(op, oplenth - i - 1);
								 mod = mod - cache * pow(op, oplenth - i - 1);
								 //printf("     %d %d\n",cache,mod);
								 if (cache <= 9)
								 {
								 System.out.printf("%d",cache);
								 }
								 else
								 {
									 wei = 'A' + cache-10;
									 System.out.printf("%c",wei);
								 }
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}


}

