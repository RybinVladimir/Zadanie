
public class Example {
	 public static void main(String args[]) {
	  //    String str = "7385764686251444473997915123782972536343732657517834671759462795461213782428342931896181695578996274321317419242359534783957372932953774336338118488967172727651862498838195317654289797558683458511126996217953322817229372373455862177844478443391835484591525235651863464891177927244954925827786799436536592561374269299474738321293575385899438446558569241236278779779983587912431395475244796538888373287186921647426866237756737342731976763959499149996315591584716122199183295277439872911371313924594486766479438544417416529743495114819825984524437367225234184772617942525954961136976875325182725754768372684531972614455134523596338355374444273522115362238734383164778129376628621497662965456761631796178353599629887665939521892447361219479646483978798392716119793282717739524897385958273726776318154977675546287789874265339688753977185129334929715486381875286278528247696464162297691698154712775589541945263574897266575996455547625537947927972497979333932115165151462742216327321116291372396585618664475715321298122335789262942284571328414569375464386446824882551918843185195829547373915482687534432942778312542752798313434628498295216692646713137244198123219531693559848915834623825919191532658735422176965451741869666714874158492556445954852299161868651448123825821775363219246244515946392686275545561989355573946924767442253465342753995764791927951158771231944177692469531494559697911176613943396258141822244578457498361352381518166587583342233816989329544415621127397996723997397219676486966684729653763525768655324443991129862129181215339947555257279592921258246646215764736698583211625887436176149251356452358211458343439374688341116529726972434697324734525114192229641464227986582845477741747787673588848439713619326889624326944553386782821633538775371915973899959295232927996742218926514374168947582441892731462993481877277714436887597223871881149693228928442427611664655772333471893735932419937832937953495929514837663883938416644387342825836673733778119481514427512453357628396666791547531814844176342696362416842993761919369994779897357348334197721735231299249116477"; 
	   //   char[] strToArray = str.toCharArray(); // ����������� ������ str � ������ �������� (char)
	      // ����� ������� �� �����
	    //  for(int i = 0; i < strToArray.length; i++) {
	     //    System.out.print(strToArray[i] + ","); // ��� ����������� ������� ������ ����� ���������
	   //   } 
		 
		int[] zadai = {3,8,5,7,6,4,6,8,6,2,5,1,4,4,4,4,7,3,9,9,7,9,1,5,1,2,3,7,8,2,9,7,2,5,3,6,3,4,3,7,3,2,6,5,7,5,1,7,8,3,4,6,7,1,7,5,9,4,6,2,7,9,5,4,6,1,2,1,3,7,8,2,4,2,8,3,4,2,9,3,1,8,9,6,1,8,1,6,9,5,5,7,8,9,9,6,2,7,4,3,2,1,3,1,7,4,1,9,2,4,2,3,5,9,5,3,4,7,8,3,9,5,7,3,7,2,9,3,2,9,5,3,7,7,4,3,3,6,3,3,8,1,1,8,4,8,8,9,6,7,1,7,2,7,2,7,6,5,1,8,6,2,4,9,8,8,3,8,1,9,5,3,1,7,6,5,4,2,8,9,7,9,7,5,5,8,6,8,3,4,5,8,5,1,1,1,2,6,9,9,6,2,1,7,9,5,3,3,2,2,8,1,7,2,2,9,3,7,2,3,7,3,4,5,5,8,6,2,1,7,7,8,4,4,4,7,8,4,4,3,3,9,1,8,3,5,4,8,4,5,9,1,5,2,5,2,3,5,6,5,1,8,6,3,4,6,4,8,9,1,1,7,7,9,2,7,2,4,4,9,5,4,9,2,5,8,2,7,7,8,6,7,9,9,4,3,6,5,3,6,5,9,2,5,6,1,3,7,4,2,6,9,2,9,9,4,7,4,7,3,8,3,2,1,2,9,3,5,7,5,3,8,5,8,9,9,4,3,8,4,4,6,5,5,8,5,6,9,2,4,1,2,3,6,2,7,8,7,7,9,7,7,9,9,8,3,5,8,7,9,1,2,4,3,1,3,9,5,4,7,5,2,4,4,7,9,6,5,3,8,8,8,8,3,7,3,2,8,7,1,8,6,9,2,1,6,4,7,4,2,6,8,6,6,2,3,7,7,5,6,7,3,7,3,4,2,7,3,1,9,7,6,7,6,3,9,5,9,4,9,9,1,4,9,9,9,6,3,1,5,5,9,1,5,8,4,7,1,6,1,2,2,1,9,9,1,8,3,2,9,5,2,7,7,4,3,9,8,7,2,9,1,1,3,7,1,3,1,3,9,2,4,5,9,4,4,8,6,7,6,6,4,7,9,4,3,8,5,4,4,4,1,7,4,1,6,5,2,9,7,4,3,4,9,5,1,1,4,8,1,9,8,2,5,9,8,4,5,2,4,4,3,7,3,6,7,2,2,5,2,3,4,1,8,4,7,7,2,6,1,7,9,4,2,5,2,5,9,5,4,9,6,1,1,3,6,9,7,6,8,7,5,3,2,5,1,8,2,7,2,5,7,5,4,7,6,8,3,7,2,6,8,4,5,3,1,9,7,2,6,1,4,4,5,5,1,3,4,5,2,3,5,9,6,3,3,8,3,5,5,3,7,4,4,4,4,2,7,3,5,2,2,1,1,5,3,6,2,2,3,8,7,3,4,3,8,3,1,6,4,7,7,8,1,2,9,3,7,6,6,2,8,6,2,1,4,9,7,6,6,2,9,6,5,4,5,6,7,6,1,6,3,1,7,9,6,1,7,8,3,5,3,5,9,9,6,2,9,8,8,7,6,6,5,9,3,9,5,2,1,8,9,2,4,4,7,3,6,1,2,1,9,4,7,9,6,4,6,4,8,3,9,7,8,7,9,8,3,9,2,7,1,6,1,1,9,7,9,3,2,8,2,7,1,7,7,3,9,5,2,4,8,9,7,3,8,5,9,5,8,2,7,3,7,2,6,7,7,6,3,1,8,1,5,4,9,7,7,6,7,5,5,4,6,2,8,7,7,8,9,8,7,4,2,6,5,3,3,9,6,8,8,7,5,3,9,7,7,1,8,5,1,2,9,3,3,4,9,2,9,7,1,5,4,8,6,3,8,1,8,7,5,2,8,6,2,7,8,5,2,8,2,4,7,6,9,6,4,6,4,1,6,2,2,9,7,6,9,1,6,9,8,1,5,4,7,1,2,7,7,5,5,8,9,5,4,1,9,4,5,2,6,3,5,7,4,8,9,7,2,6,6,5,7,5,9,9,6,4,5,5,5,4,7,6,2,5,5,3,7,9,4,7,9,2,7,9,7,2,4,9,7,9,7,9,3,3,3,9,3,2,1,1,5,1,6,5,1,5,1,4,6,2,7,4,2,2,1,6,3,2,7,3,2,1,1,1,6,2,9,1,3,7,2,3,9,6,5,8,5,6,1,8,6,6,4,4,7,5,7,1,5,3,2,1,2,9,8,1,2,2,3,3,5,7,8,9,2,6,2,9,4,2,2,8,4,5,7,1,3,2,8,4,1,4,5,6,9,3,7,5,4,6,4,3,8,6,4,4,6,8,2,4,8,8,2,5,5,1,9,1,8,8,4,3,1,8,5,1,9,5,8,2,9,5,4,7,3,7,3,9,1,5,4,8,2,6,8,7,5,3,4,4,3,2,9,4,2,7,7,8,3,1,2,5,4,2,7,5,2,7,9,8,3,1,3,4,3,4,6,2,8,4,9,8,2,9,5,2,1,6,6,9,2,6,4,6,7,1,3,1,3,7,2,4,4,1,9,8,1,2,3,2,1,9,5,3,1,6,9,3,5,5,9,8,4,8,9,1,5,8,3,4,6,2,3,8,2,5,9,1,9,1,9,1,5,3,2,6,5,8,7,3,5,4,2,2,1,7,6,9,6,5,4,5,1,7,4,1,8,6,9,6,6,6,7,1,4,8,7,4,1,5,8,4,9,2,5,5,6,4,4,5,9,5,4,8,5,2,2,9,9,1,6,1,8,6,8,6,5,1,4,4,8,1,2,3,8,2,5,8,2,1,7,7,5,3,6,3,2,1,9,2,4,6,2,4,4,5,1,5,9,4,6,3,9,2,6,8,6,2,7,5,5,4,5,5,6,1,9,8,9,3,5,5,5,7,3,9,4,6,9,2,4,7,6,7,4,4,2,2,5,3,4,6,5,3,4,2,7,5,3,9,9,5,7,6,4,7,9,1,9,2,7,9,5,1,1,5,8,7,7,1,2,3,1,9,4,4,1,7,7,6,9,2,4,6,9,5,3,1,4,9,4,5,5,9,6,9,7,9,1,1,1,7,6,6,1,3,9,4,3,3,9,6,2,5,8,1,4,1,8,2,2,2,4,4,5,7,8,4,5,7,4,9,8,3,6,1,3,5,2,3,8,1,5,1,8,1,6,6,5,8,7,5,8,3,3,4,2,2,3,3,8,1,6,9,8,9,3,2,9,5,4,4,4,1,5,6,2,1,1,2,7,3,9,7,9,9,6,7,2,3,9,9,7,3,9,7,2,1,9,6,7,6,4,8,6,9,6,6,6,8,4,7,2,9,6,5,3,7,6,3,5,2,5,7,6,8,6,5,5,3,2,4,4,4,3,9,9,1,1,2,9,8,6,2,1,2,9,1,8,1,2,1,5,3,3,9,9,4,7,5,5,5,2,5,7,2,7,9,5,9,2,9,2,1,2,5,8,2,4,6,6,4,6,2,1,5,7,6,4,7,3,6,6,9,8,5,8,3,2,1,1,6,2,5,8,8,7,4,3,6,1,7,6,1,4,9,2,5,1,3,5,6,4,5,2,3,5,8,2,1,1,4,5,8,3,4,3,4,3,9,3,7,4,6,8,8,3,4,1,1,1,6,5,2,9,7,2,6,9,7,2,4,3,4,6,9,7,3,2,4,7,3,4,5,2,5,1,1,4,1,9,2,2,2,9,6,4,1,4,6,4,2,2,7,9,8,6,5,8,2,8,4,5,4,7,7,7,4,1,7,4,7,7,8,7,6,7,3,5,8,8,8,4,8,4,3,9,7,1,3,6,1,9,3,2,6,8,8,9,6,2,4,3,2,6,9,4,4,5,5,3,3,8,6,7,8,2,8,2,1,6,3,3,5,3,8,7,7,5,3,7,1,9,1,5,9,7,3,8,9,9,9,5,9,2,9,5,2,3,2,9,2,7,9,9,6,7,4,2,2,1,8,9,2,6,5,1,4,3,7,4,1,6,8,9,4,7,5,8,2,4,4,1,8,9,2,7,3,1,4,6,2,9,9,3,4,8,1,8,7,7,2,7,7,7,1,4,4,3,6,8,8,7,5,9,7,2,2,3,8,7,1,8,8,1,1,4,9,6,9,3,2,2,8,9,2,8,4,4,2,4,2,7,6,1,1,6,6,4,6,5,5,7,7,2,3,3,3,4,7,1,8,9,3,7,3,5,9,3,2,4,1,9,9,3,7,8,3,2,9,3,7,9,5,3,4,9,5,9,2,9,5,1,4,8,3,7,6,6,3,8,8,3,9,3,8,4,1,6,6,4,4,3,8,7,3,4,2,8,2,5,8,3,6,6,7,3,7,3,3,7,7,8,1,1,9,4,8,1,5,1,4,4,2,7,5,1,2,4,5,3,3,5,7,6,2,8,3,9,6,6,6,6,7,9,1,5,4,7,5,3,1,8,1,4,8,4,4,1,7,6,3,4,2,6,9,6,3,6,2,4,1,6,8,4,2,9,9,3,7,6,1,9,1,9,3,6,9,9,9,4,7,7,9,8,9,7,3,5,7,3,4,8,3,3,4,1,9,7,7,2,1,7,3,5,2,3,1,2,9,9,2,4,9,1,1,6,4,7,7,7}; 

		int summ = 0;
		for (int i=0; i<zadai.length;i++ ) 
			if(i+1<zadai.length )
			{
				if(zadai[i] == zadai[i+1]) { summ += zadai[i];}
			} 
			else {if (zadai[0]==zadai[i]){ summ += zadai[i]; } } 

	    	System.out.print(summ);
	    
	   
	    }
	 	
}
