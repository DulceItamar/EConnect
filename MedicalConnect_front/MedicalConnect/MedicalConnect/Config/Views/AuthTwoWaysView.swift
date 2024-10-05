//
//  AuthTwoWaysView.swift
//  MedicalConnect
//
//  Created by Dulce Itamar Vigueras Ballesteros on 02/10/24.
//

import SwiftUI

struct AuthTwoWaysView: View {
    var body: some View {
        VStack{
            Text(/*@START_MENU_TOKEN@*/"Hello, World!"/*@END_MENU_TOKEN@*/)
        }
        .toolbarBackground(.main, for: .navigationBar)
        .toolbarBackground(.visible, for: .navigationBar)
        .navigationTitle("Autenticación")
    }
}

#Preview {
    AuthTwoWaysView()
}
